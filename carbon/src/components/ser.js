import React,{ useEffect, useState} from 'react';
import './desgin.css';
import { ser } from "../func/func";


function Ser()
{
    const[service,setService]= useState([])

    
   useEffect(()=>{
    ser().then((Response)=>{
        setService(Response.data);
    }).catch(error=>{
        console.error(error);
    })
    
   },[])
    return(
        
        <div id="ser">
            <h1 class="header">Our Services</h1>

            <div class="card">
                {
                    service.map(service=><div class="card" key={service.id} >
                    <h2>{service.ser_code}</h2>
                    <h3>{service.ser_name}</h3>
                    <p>{service.ser_des}</p>
                </div> )
                }
                
            </div>
           
        
        
        </div> 
    )
}

export default Ser;