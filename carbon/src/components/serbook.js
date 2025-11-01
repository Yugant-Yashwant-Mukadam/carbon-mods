import { serbook } from '../func/func'
import loginback from './loginback.jpg'
import React,{useEffect,useState} from 'react';
function Serbook() {

   const [serviceid, setserid]=useState('')
   const [phone, setPhone]=useState('')
   
   
   function handle_serid(e){
    setserid(e.target.value);
  }

   function handle_phone(e){
    setPhone(e.target.value);
  }

  function serbo(e){
    e.preventDefault();
    if(phone.length === 10 && /^[0-9]+$/.test(phone))
      {
        
      const book ={serviceid,phone}
      console.log(book);
  
      serbook(book).then((response)=>{
        console.log(response.data);
      })
      alert("YOUR SERVICE IS BOOKED");
    }
    else{
      alert("wrong phone number entered")
    }
      
    }



  return (
    <div id="login">
        <img id="loginback" src={loginback}></img>
      <h1 id="loginh1">Book Your Service </h1>
      <form>
        <h4>Enter Service Id</h4>
        <input placeholder="eg:c12" value={serviceid} onChange={handle_serid}></input>
        <h4>Customer phone</h4>
        <input value={phone} onChange={handle_phone} ></input>
        <button id="sub" onClick={serbo} >Book</button>
      </form>
    </div>



  );
}

export default Serbook;
