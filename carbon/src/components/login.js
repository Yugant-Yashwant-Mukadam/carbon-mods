import { addcust } from '../func/func'
import { cust } from '../func/func'

import loginback from './loginback.jpg'
import React,{useEffect,useState} from 'react';
function Login() {
    const [name,setName ]=useState('')
    
    const [phone, setPhone]=useState('')

    


    function handle_name(e){
    setName(e.target.value);
  }

   function handle_phone(e){
    setPhone(e.target.value);
  }

  function addcustomer(e){
    if(phone.length === 10 && /^[0-9]+$/.test(phone))
      {
        e.preventDefault();
    const customer ={name,phone}
    console.log(customer);

    addcust(customer).then((response)=>{
      console.log(response.data);
    })
    alert("customer registored");
      }
      else{
        alert("wrong phone number entered")
      }
      
    
    
  }

    
  return (
    <div id="login">
      

        <img id="loginback" src={loginback}></img>
      <h1 id="loginh1">REGISTER </h1>
      <form action="/regiter" method="post">
        <h4>NAME</h4>
        <input  value={name} onChange={handle_name}></input>
        <h4>Phone Number</h4>
        <input  value={phone} onChange={handle_phone}></input>
        <p id="error" className='noerror'>enter proper number</p>
        <button id="sub" type="submit" onClick={addcustomer}>SUBMIT</button>
       
      </form>
    </div>



  );
}

export default Login;
