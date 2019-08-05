import React from 'react';
import axios from 'axios';

export default class UserDetails extends React.Component{

    constructor(){
        super();
        this.state = {
            users:{}
        }
    }

    componentDidMount(){
        console.log(`Component is mounted on the DOM`)
        const {id} = this.props.match.params;
        axios.get('https://jsonplaceholder.typicode.com/users/'+id)
        .then(res =>{ const users = res.data;
            console.log(users);
            this.setState({
                users:res.data      
                      
            })
    
        })
    
    }

    render(){

        const {id} = this.props.match.params;
        console.log(`id is ${id}`)
       // const filteredList = this.state.users.filter(phone => phone.id ==id);
      //  console.log(filteredList[0]["name"])
    
        return (
           
            
            <div>
            <h1>User Details</h1>
            <h1>{this.state.users.id}</h1>
            <h2>{this.state.users.name}</h2>
            <h2>{this.state.users.username}</h2>
            <h2>{this.state.users.email}</h2>
            </div>
        )




}
}