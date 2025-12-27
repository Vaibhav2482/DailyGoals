import Card from './Card.jsx';
function HomeComponent(){
    var name="Avinash";
    return(
        <>
            <div className="home">
                <h1>This is Home Component</h1>
                <Card name={name} />

                
            </div>
        </>
    );
}

export default HomeComponent;    