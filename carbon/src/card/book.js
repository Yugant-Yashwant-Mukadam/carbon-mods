
import './style.css'
import book_img from './book.jpg'
import { useNavigate } from "react-router-dom";



function Book(){
    const nav = useNavigate();

    return(
        <foot>
            <div id="book">
                <img id="bookimg" src={book_img}></img>
                <button id="bookbtn" onClick={()=>nav('/serbook')}><h1 id="bookid">Book Now</h1></button>
            </div>
        </foot>
    )
}

export default Book;