const express = require('express');
const path = require('path');
const serveStatic = require('serve-static');
const app = express();
app.use(serveStatic(path.join(__dirname,"/dist")));
const port = process.env.PORT || 5000;
const hostname = '127.0.0.1';

app.listen(port, hostname, () => {
   console.log(`Server running at http://${hostname}:${port}/`);
 });