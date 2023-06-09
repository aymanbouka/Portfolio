
const polyMin = 1;
const  polyMax = 10;

const polygons = {
    "1": "Monogon",
    "2": "Bigon",
    "3": "Triangle",
    "4": "Tetragon",
    "5": "Pentagon",
    "6": "Hexagon",
    "7": "Septagon",
    "8": "Octagon",
    "9": "Nonagon",
    "10": "Decagon"
}

function getNumSides(){
    let number = prompt("The animal would like your number between 1-10");

    if(number == "" || number == null)
    {
        alert("user didnt enter a number");

    }
    else
    {
        if(validateEntry(number) === true)
        {
            promptRounded = Math.round(Math.abs(number))
            let answer = polygons[promptRounded];
            alert(answer);
        }
    }

}





function validateEntry(numSide)
{
    if(isNaN(numSide) || numSide < 1 || numSide > 10)
    {
        alert("entry is invalid");
        return false;
    }
    else{
        return true;
    }

}







