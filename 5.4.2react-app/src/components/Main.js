import React from 'react';
import Card from './Card';
import Axios from 'axios';
import { thisExpression } from '@babel/types';

export default class Main extends React.Component {
  
    constructor(){
        super();
        this.state={
            phones:[
               
            ]
        }
       
        const a = [
            {
                name:'IPhone',
                desc:'Latest Iphone model from Apple'
            },
            {
                name:'One Plus 6',
                desc:'Flagship phone from OnePlus'
            },
            {
                name:'Samsung S10',
                desc:'Hight performance..'
            }
        ]
       
        this.selectedProduct = this.selectedProduct.bind(this);
    }

    selectedProduct({title, body}){
     
    
     const filterdList= this.state.phones.filter(phone =>phone.name!=title)
        this.setState({
            phones :filterdList 
        })
     
       
    }

    componentDidMount(){
        console.log(`Component is mounted on the DOM`)
        axios.get(`https://jsonplaceholder.typicode.com/users`)
        then(res => {
            console.log(res);
            console.log(res.data);
          })
        this.setState({
            phones:[
                {
                    name:'IPhone',
                    desc:'Latest Iphone model from Apple'
                },
                {
                    name:'One Plus 6',
                    desc:'Flagship phone from OnePlus'
                },
                {
                    name:'Samsung S10',
                    desc:'Hight performance..'
                }
            ]
    }
        )
       
    }
    render(){
        return (
            <div className="left">
                {
                    this.state.phones.map((phone,index) => <Card 
                                                key={index} 
                                                title={phone.name} 
                                                body={phone.desc}
                                                selected = {this.selectedProduct}/>)
                }
            </div>
        );
    }
}