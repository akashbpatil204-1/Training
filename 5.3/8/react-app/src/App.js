import React from 'react';
import './App.css';
import Header from './components/Header';
import Sidear from './components/Sidebar';
import Footer from './components/Footer';
import Main from './components/Main';
import UserDetails from './components/UserDetails';


function App() {
  return (
    <div>
      <Header/>
      <Sidear/>
      <Main/>
      <Footer/>
      <h1>App is loaded</h1>
    </div>
  );
}

export default App;
