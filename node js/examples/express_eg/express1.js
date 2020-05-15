const fs = require('fs');
const express = require('express');
const app = express();
const port = 6500;

app.get('/', (req, res) => {
    res.send('<h1> Welcome !!! </h1>');
})

app.get('/getMovies',(req, res) => {
    fs.readFile('../json1/db.json',(err, data) => {             //Data comes in form of string from file and is parsed into JSON object
        if (err)
            throw err;
        else
            console.log(typeof data);
            res.send(JSON.parse(data));
            //res.send(data);
    })
})

app.listen(port, (err) => {
    if (err) throw err;
    console.log('server is running on port ' + port);
})