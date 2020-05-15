const fs = require('fs');
const express = require('express');
const app = express();
const port = 6500;

app.get('/',(req,res)=>{
    res.status(200).send('<h1>Welcome to api For Fs</h1>')
});

app.get('/movies',(req,res) => {
    fs.readFile('db.json',(err,result) => {
        if(err) throw err;
        res.status(200).send(JSON.parse(result));   
    })
})

app.listen(port, (err) => {
    if (err) throw err;
    console.log('server is running on port ' + port);
})
