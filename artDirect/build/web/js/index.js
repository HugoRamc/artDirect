


function closeModal()
{
    var mod = document.getElementById('myModal');
    mod.style.display="none";
}

function openModal()
{
    var mod = document.getElementById('myModal');
    mod.style.display="block";

}

window.onclick = function(event) {
    var modal = document.getElementById('myModal');
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
