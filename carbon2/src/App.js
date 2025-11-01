
import {BrowserRouter, Routes, Route, useNavigate} from 'react-router-dom';
import appRoute from './Router.js';
import Home from './home.js';

function App() {
  return (
    <div id="app">
      <BrowserRouter>
      <Routes>
         <Route path="/" element={<Home />} />
{
  appRoute.map((route, i)=>(
    <Route key={i} path={route.path} element={route.element}/>
  ))
}
      </Routes>
      </BrowserRouter>
     
    </div>
  );
}

export default App;
