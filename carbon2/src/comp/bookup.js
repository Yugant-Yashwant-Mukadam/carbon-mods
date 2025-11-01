import { bookupdate } from '../fun';
import './comm.css';
import React,{useState} from 'react';

function Addser()
{

  const [phone, setphone]=useState('')
  const [booking, setbooking]=useState('')
  const [servicedone, setservice]=useState('')
  const [pickup, setpickup]=useState('')

  function handlesetphone(e){
    setphone(e.target.value);
  }

  function handlesetbooking(e){
    setbooking(e.target.value);
  }

  function handlesetservice(e){
    setservice(e.target.value);
  }
  function handlesetpickup(e){
    setpickup(e.target.value);
  }

  function addservice(e){
    if(phone.length === 10 && /^[0-9]+$/.test(phone)){
      e.preventDefault();
    const bookup ={phone :Number(phone),booking,servicedone,pickup}
    console.log(bookup);

    bookupdate(bookup).then((response)=>{
      console.log(response.data)
    })
    alert("Customer updated");
    }
    else{
      alert("Updated")
    }
    
  }

    return(
        
         <div id="login">
       
      <h1 id="loginh1">Service Update </h1>
      <form>
        <h4>Customer Phone</h4>
        <input id="phone"  value={phone} onChange={handlesetphone}></input>
        <h4>Booking Done</h4>
        <input id="booking"value={booking} onChange={handlesetbooking}></input>
        <h4>Service Completed</h4>
        <input id="service"value={servicedone} onChange={handlesetservice} ></input>
         <h4> Pickup</h4>
        <input id="pickup"value={pickup} onChange={handlesetpickup} ></input>
        <button id="sub" onClick={addservice}>Update</button>
      </form>
        </div>
    );
}

export default Addser;
