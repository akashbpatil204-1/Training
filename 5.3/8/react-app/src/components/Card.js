import React,{Component} from 'react';
import {BrowserRouter as Router,Route, Link} from 'react-router-dom';

export default class Card extends Component {
    constructor(){
        super();
        //this.details = this.details.bind(this);
    }
   /* details(){
        console.log('Printing the value of this .. inside the details');
        console.log(this);
    }*/
    render(){
        return  (
            <div className="card" style={{width: 18 +'rem', margin: 10+'px'}}>
                <div className="card-body">
                <h4 className="card-title">{this.props.id}</h4>
                    <h5 className="card-title">{ this.props.title}</h5>
                    <p className="card-text">{this.props.body}</p>
                    <a className="btn btn-primary"><Link   to={`/users/${this.props.id}`}>Details</Link></a>
                </div>
                
                 
                </div>
        );
    }
}
