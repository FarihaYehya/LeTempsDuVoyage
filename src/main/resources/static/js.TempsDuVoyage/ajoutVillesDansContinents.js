$("#boutonajoutVillesAContinent").click(() =>{

    let valeurs = { nomContinents: $("#inputNomContinents").val(), nomVilles: $("#inputNomVillesDansContinents").val()};
 console.log(valeurs);
  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationMultiVilles",
    data: JSON.stringify(valeurs),
    success: function (resultat) {
      alert("L'API m'a retourné : " + resultat);
       }
    });
   });
