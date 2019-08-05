import React from 'react';
import Card from './Card';
import axios from 'axios';

export default class Main extends React.Component {
    constructor(){
        super();
        this.state={
            phones:[]
        }
        this.selectedProduct = this.selectedProduct.bind(this);
    }

    selectedProduct({id,title, body}){
        //console.log(phones.name)
      const filteredList = this.state.phones.filter(phone => phone.id ==id);
        console.log('Inside the selectedProduct function ');
        this.setState({
            phones:filteredList
        })
    }
 
    componentDidMount(){
        console.log(`Component is mounted on the DOM`)
        axios.get('https://jsonplaceholder.typicode.com/users')
        .then(res =>{ const users = res.data;
            console.log(users);
            this.setState({
                phones:res.data            
            })
    
        })
    
       
    }

    render(){
        return (
            <div className="container">
                <div className="row">
                {
                    this.state.phones.map((phone,index) => <Card 
                                                key={index} 
                                                title={phone.name} 
                                                body={phone.desc}
                                                id = {phone.id}
                                                        selected = {this.selectedProduct}/>)
                }
                </div>
            </div>
        );
    }
}

