//PART OF VIDEO LECTURE FROM EDUREKA
const express = require('express');
const app = express();

const request = require('request');
const port = 5400;


var url = 'http://api.openweathermap.org/data/2.5/weather?q=London&appid=6a4b63bf01bc2a6272d0c401827b6b00';

app.use(express.static(__dirname + '/public')); // express uses public directory as static resource
app.set('views', './src/views');
app.set('view engine', 'ejs');      //main.ejs file in views for templates

function getWeather(url){
    var options = {
        url: url,
        headers: {
            'User-Agent': 'request', 

        }
    }
    return new Promise((resolve, reject)=>{
        request.get(options,url,(err,response,body)=>{
            if(err){
                reject(err);
            }
            else{
                resolve(body);
            }
        })
    })
}
app.get('/', (req, res) =>{
    res.send("API is working");
})

app.get('/weather',(req, res)=>{
    // request(url,(err,response,body)=>{
    //     if(err){
    //         console.log(err);
    //         res.send("Error calling weather API");
    //     }
    //     else{
    //         res.send(JSON.parse(body));
    //     }
    // })
    var dataPromise = getWeather(url);
    dataPromise.then(resp=>{
        res.render('main',{data: JSON.parse(resp)});
    }).catch(err=>{
        res.render('main',{error: err});
    });

})
app.listen(port, (err) => {
    if (err)
        console.log("Error starting express on port:" + port);
    else
        console.log("app running on port:" + port);

})