import './comm.css';
import { serboo } from '../fun';
import React,{ useEffect, useState} from 'react';

function Servicerev(){
       const[serbook,setserrec]= useState([])
    
        useEffect(()=>{
        serboo().then((Response)=>{
            setserrec(Response.data);
            console.log('Service bookings:', Response.data);
            console.log('Service bookings:', JSON.stringify(Response.data, null, 2));
        }).catch(error=>{
            console.error(error);
        })
        
       },[])
return(
    <div id="ser">
        <h1>Service Recived</h1>
        <table>
           
        <tr id="border">
            <th id="border">Customer Phone no</th>
            <th id="border">Service Id</th>
        </tr> {serbook.map(serbook=>
        <tr key={serbook.id}>
            <td id="border">
                {serbook.phone}
            </td>
            <td id="border">
                {serbook.serviceid}
            </td>
        </tr>)}
    </table>
    
    </div>
    
);
}

export default Servicerev;
