import React from "react";
import './style.css'
import nav_logo from './nav_logo.png'
import sm1 from './sm1.png'
import sm2 from './sm2.png'
import sm3 from './sm3.png'
import sm4 from './sm4.png'
import { Link } from "react-router-dom";

function foot(){
    return(
        <footer>
            <div id="foot_card">
                <img id="footimg"src={nav_logo}></img>
            
            <div>
                <p id="foottext">At Carbon Mods, we believe every car deserves a personal touch. We specialize in complete automotive customization — from exterior body kits and performance tuning to luxurious interior upgrades. Our expert team blends cutting-edge technology with creative craftsmanship to enhance both the look and feel of your ride. Whether you seek speed, style, or sophistication, Carbon Mods transforms your vision into reality with precision and passion.</p>
            </div>
            </div>
            <div id="foot_card">
                <h2 id="footh2">Services</h2>
                <ul>
                    <li>Full Body Kits & Exterior Upgrades</li><br></br>
                    <li>Premium Paint Jobs & Vinyl Wraps</li><br></br>
                    <li>Engine Tuning & ECU Remapping</li><br></br>
                    <li>Exhaust System Modifications</li><br></br>
                    <li>Alloy Wheels & Tire Upgrades</li><br></br>
                    <li>Interior Customization & Upholstery</li><br></br>
                    <li>Ceramic Coating & Paint Protection Film (PPF)</li><br></br>
                    <li>Lighting Upgrades (LEDs, DRLs, Projectors)</li><br></br>
                    <li>Performance Suspension & Brake Upgrades</li><br></br>
                    <li>Car Detailing & Deep Cleaning</li><br></br>
                </ul>

            </div>
            <div id="foot_card">
                <h2 id="footh2">Social Media</h2>
            
            <div id="smbox">
              <a href=""><img id="sm" src={sm1}></img></a>  
                <img id="sm" src={sm2}></img>
                <img id="sm" src={sm3}></img>
                <img id="sm" src={sm4}></img>
            </div>
            </div>
        
        </footer>
    )
}

export default foot;