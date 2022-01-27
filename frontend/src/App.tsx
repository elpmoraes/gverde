import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
// import Listing from 'pages/Listing';
// import Form from 'pages/Form';
 import Products from 'pages/Products';
import Navbar from "components/Navbar";
import Dashboard from "pages/Dashboard";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
      <Route path="/" element={<Dashboard />} />
        <Route path="/product" element={<Products />} />
        {/* <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route> */}
      </Routes>
    </BrowserRouter>
  );
}

export default App;