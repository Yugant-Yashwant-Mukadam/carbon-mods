
import Home from './home.js';
import Addser from './comp/addser.js'   ;  
 import Allcust from './allcust.js'   ;  
 import Bookup from './comp/bookup.js'   ;  


const appRoute =[

    {
        path:'/addser', element:<Addser/>
    },
    {
        path:'/allcust', element:<Allcust/>
    },
    {
        path:'/bookup', element:<Bookup/>
    }
];


export default appRoute;