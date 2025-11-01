import { addser } from '../fun';
import './comm.css';
import React,{useState} from 'react';

function Addser()
{

  const [ser_code, setSer_code]=useState('')
  const [ser_name, setSer_name]=useState('')
  const [ser_des, setSer_des]=useState('')

  function handle_ser_code(e){
    setSer_code(e.target.value);
  }

  function handle_ser_name(e){
    setSer_name(e.target.value);
  }

  function handle_ser_des(e){
    setSer_des(e.target.value);
  }

  function addservice(e){
    e.preventDefault();
    const service ={ser_code,ser_name,ser_des}
    console.log(service);

    addser(service).then((response)=>{
      console.log(response.data)
    })
    alert("SERVICE ADDED");
  }

    return(
        
         <div id="login">
       
      <h1 id="loginh1">Add Service </h1>
      <form>
        <h4>Service Code</h4>
        <input id="ser_code"placeholder="eg:s12" value={ser_code} onChange={handle_ser_code}></input>
        <h4>Service Name</h4>
        <input id="ser_name"value={ser_name} onChange={handle_ser_name}></input>
        <h4>Service Description</h4>
        <input id="ser_des"value={ser_des} onChange={handle_ser_des} ></input>
        <button id="sub" onClick={addservice}>Add Service</button>
      </form>
        </div>
    );
}

export default Addser;
