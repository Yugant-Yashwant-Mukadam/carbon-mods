import ser_up_img from './ser_up.jpg'
import { bookup } from '../func/func'
import React,{useEffect,useState} from 'react';

function Ser_up(){

    const[bookupinfo,setbookup]= useState([])
    const [cusphone, setPhone]=useState('')
    
       function send_request(e){
        
            setPhone(e.target.value)
       }
       function bringdata(e){
           if(cusphone.length === 10 && /^[0-9]+$/.test(cusphone))
            {
             e.preventDefault();
           const bookupPhone = cusphone
           console.log(bookupPhone);
       
           bookup(bookupPhone).then((response)=>{
             console.log(response.data);
             setbookup(response.data);
             const data = Array.isArray(response.data)
          ? response.data
          : [response.data];

        setbookup(data);
           })
        } 
        else
            {
            alert("Wrong phone number");
        }
        
         }

    return(
        
            <div id="ser_up">
                <form id="ser_upsearch">
                    <h3>Enter your phone number</h3>
                    <input id="ser_up_in" value={cusphone} onChange={send_request} ></input>
                    <button id="ser_up_btn" onClick={bringdata}>Enter</button>
                </form>
                <img id="ser_up_img" src={ser_up_img} alt="adsa"></img>
                <h1 id="serh1">Service Update</h1>
                
                < div id="ser_up_div"  key={bookupinfo.id}>
                   <table>
                    <tr>
                        <th>
                            Booking
                        </th>
                        <th>
                            Servicing
                        </th>
                        <th>
                            Pickup
                        </th>
                    </tr>
                    {bookupinfo.map(bookupinfo=>
                        <tr key={bookupinfo.phone}>
                            <td>
                                {bookupinfo.booking}
                            </td>
                            <td>
                                {bookupinfo.servicedone}
                            </td>
                            <td>
                                {bookupinfo.pickup}
                            </td>
                        </tr>
                    )}
                   </table>
            
                </div>
            
             </div>   
                
        
    )
}

export default Ser_up;