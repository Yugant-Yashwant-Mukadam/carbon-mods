
import {BrowserRouter, Routes, Route, useNavigate} from 'react-router-dom';
import appRoute from './Routes.js';
import Home from './Home.js';

function App() {
  return (
    <div id="app">
      <BrowserRouter>
      <Routes>
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
