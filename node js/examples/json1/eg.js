
const fs = require('fs');
fs.readFile('./db.json', (err, res) => {
    if (err)
        throw err;
    else{
        try {
            console.log(typeof res);
            console.log(JSON.parse(res));
        }
        catch (e){
            console.error(e);
        }
    }

});
const series = {
    title: 'Money Heist',
    author: 'Spanish'
}
const seriesJSON = JSON.stringify(series);  // Javascript object to JSON string.
console.log(seriesJSON);
console.log(typeof seriesJSON);
const parsed = JSON.parse(seriesJSON);
console.log(parsed.author);

