function Card(props){
    return(
        <>
            <div className="card">
                <h2>Welcome, {props.name}</h2>
            </div>
        </>
    );
}
export default Card;