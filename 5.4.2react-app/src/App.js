import React from 'react';
import './App.css';
import Header from './components/Header';
import Sidear from './components/Sidebar';
import Footer from './components/Footer';
import Main from './components/Main';

function App() {
  return (
    <div>
      <Header/>
      <Sidear/>
      <Main/>
      <Footer/>
    </div>
  );
}

export default App;
