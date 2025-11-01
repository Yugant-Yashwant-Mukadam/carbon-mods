import './card/card.css';
import React from "react";
import card_img from './card/card_photo.webp'
import card2 from './card/card2.jpeg'
import card3 from './card/card3.webp'
function card(){
    return(
        
        <article>
            
            <div id="card">
                <div>
                    <img id="card1"src={card_img}></img>
                </div>
                <div >
                    <h2>Tunning</h2><br></br>
                    <p>Optimize your car’s power, efficiency, and performance for a smoother, more responsive drive.</p>
                </div>
            </div>

            <div id="card">
                <div>
                    <img id="card1"src={card2}></img>
                </div>
                <div >
                    <h2>Interior Customization</h2><br></br>
                    <p>Redefine your car’s cabin with personalized designs, premium materials, and comfort-focused upgrades.</p>
                </div>
            </div>

            <div id="card">
                <div>
                    <img id="card1"src={card3}></img>
                </div>
                <div >
                    <h2>Body Work</h2><br></br>
                    <p>Restore or restyle your car’s exterior with precision detailing, dent repair, and custom finishes.</p>
                </div>
            </div>
        </article>
    )

}

export default card;