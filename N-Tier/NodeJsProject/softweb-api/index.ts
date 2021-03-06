/* ============== Server ===================
- Import all Controller
- Create server Api Localhost:8080/Controller/Action/Param 
  ========================================== */

let express = require('express');
import userController from './Controllers/UserController';

const app  = express();
const IP   = '127.0.0.1';
const PORT = 8080;

app.use(express.json());

userController(app);

app.listen(PORT,IP); 