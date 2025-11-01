import Ser from './components/ser.js'
import Book from './components/serbook.js'
import Login from './components/login.js';
import Ser_up from './components/ser_up.js';
import Home from './Home.js';       


const appRoute =[
{
    path:'/ser', element:<Ser/>
},
{
    path:'/serbook', element:<Book/>
},
{
    path:'/login', element:<Login/>
},
{
    path:'/ser_up', element:<Ser_up/>
},
{
    path:'/', element:<Home/>
}];


export default appRoute;