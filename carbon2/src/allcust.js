import './comp/comm.css';
import React,{ useEffect, useState} from 'react';
import { cust } from './fun';

function Allcust(){
    const[customer,setCustomer]= useState([])

    useEffect(()=>{
    cust().then((Response)=>{
        setCustomer(Response.data);
    }).catch(error=>{
        console.error(error);
    })
    
   },[])
return(
    <div id="ser">
        <h1>ALL CUSTOMERS</h1>
        <table>
        <tr id="border">
            <th id="border">Customer Id</th>
            <th id="border">Customer name</th>
          
            <th id="border">Customer Phone no</th>
        </tr>
        
            {customer.map(customer=>
            <tr key={customer.id}>
                <td id="border">
                {customer.id}
            </td>
            <td id="border">
                {customer.name}
            </td>
            
            <td id="border">
                {customer.phone}
            </td>
            </tr>
            )
                
            }

        
    </table>
    
    </div>
    
);
}

export default Allcust;