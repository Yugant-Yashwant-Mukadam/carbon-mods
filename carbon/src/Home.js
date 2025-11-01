
import './Home.css';
import nav_logo from './card/nav_logo.png'
import main_vid from './main_vid.mp4'
import nav_logo_rem from './nav_logo_rem.png'
import Card from './card.js'
import Foot from './card/foot.js'
import Book from './card/book.js'

import {BrowserRouter, Routes, Route,Router, useNavigate} from 'react-router-dom';
import appRoute from './Routes.js';

function Home() {
  const nav = useNavigate();
  return (
    <div id="app">
      <nav>
        <div>
          <img id="nav_logo" src={nav_logo} alt="logo"></img>
        </div>
        <div id="nav_but">
          <button className="nav_but" onClick={()=>nav('/ser')}><h3>SERVICES</h3></button>
          <button className="nav_but" onClick={()=>nav('/login')}><h3>REGISTER</h3></button>
          <button className="nav_but" onClick={()=>nav('/ser_up')}><h3> SERVICE UPDATES</h3></button>
        </div>
      </nav>
      <main>
        <div>
          <video src={main_vid} autoPlay controls loop ></video>
          <div id="poster">
            <img src={nav_logo_rem} alt="logo"></img>
          </div>
          
          
        </div>
        <h1>Our Services</h1>
      </main>
      <Card/>
      <Book/>
      <Foot/>
    </div>
  );
}

export default Home;
