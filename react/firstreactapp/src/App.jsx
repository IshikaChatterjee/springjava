import './App.css'
import { useState, useEffect } from 'react';

function App() {
  const [data, setData] = useState(null);

  
  useEffect(() => {
    fetch('http://localhost:8080/')
    .then(response => response.json())
    .then(data => setData(data))
  
  }, [])

  if(data) {
    console.log(JSON.stringify(data));
}

  
  //very very important hooks concept for react js
  let [counter, setCounter] =useState(22)

  //let counter = 22

  const addValue = () => {
    counter = counter + 1;
    setCounter(counter)
    console.log("The value of counter variable is:",counter)
  }

  const reduceValue = () => {
    counter = counter - 1;
    if(counter < 0){
      setCounter(0)
    }
    else{
      setCounter(counter)
      console.log("The value of counter variable is:" , counter)
    }
    
    
  }

  // onClick is an event listener in javascript that detects mouse clicks

  return (
    <>
    <h1>Counter App</h1>
    <h2>Count Value is: {counter}</h2>
    <button onClick={addValue}>Add Value</button>
    <br/>
    <br/>
    <button onClick= {reduceValue}>Reduce Value</button>
    <br/>
    <br/>
    <h2>Integration of <p style={{color: 'green'}}>Spring Boot</p> with <p style={{color: 'blue'}}>React Frontend</p></h2>
    <div>
        {data ? <p>{JSON.stringify(data)}</p> : <p>Loading...</p>}
      </div>
    </>
  )
}

export default App
