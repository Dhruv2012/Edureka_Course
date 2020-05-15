const fs = require('fs');
//const express = require('express');
//const app = express();

var input = process.stdin;
input.setEncoding('utf8');
console.log("Please input text in command line.");

input.on('data', function(data) {
    data = data.replace("\n", "");
    //console.log(data);
    fs.exists(data + ".txt", function(exists) {
        if (exists) {
            console.log("File exists");
            process.exit();
        }
        else{
            fs.writeFileSync(data + ".txt", 'You are awesome', function(err) {
                if (err)
                    throw err;
            })
            console.log("File created");
            process.exit();
        }
    })
})