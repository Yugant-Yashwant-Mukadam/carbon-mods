import nav_logo from './nav_logo.png'
import './App.css';
import Servicerec from './comp/servicerec.js'
import {BrowserRouter, Routes, Route, useNavigate} from 'react-router-dom';
import router from './Router.js'

function Home() {
   const nav = useNavigate();
  return (
   
    <div className="App">
      
      <nav>
        <div>
          <img id="nav_logo" src={nav_logo} alt="logo"></img>
        </div>
        <div id="nav_but">
          <button className="nav_but" onClick={()=>nav('/addser')}><h3>ADD SERVICES</h3></button>
          <button className="nav_but" onClick={()=>nav('/bookup')}><h3> SERVICE UPDATES</h3></button>
          <button className="nav_but"onClick={()=>nav('/allcust')}><h3> ALL CUSTOMERS</h3></button>
        </div>
      </nav>
      <Servicerec/>
    </div>
  );
}

export default Home;