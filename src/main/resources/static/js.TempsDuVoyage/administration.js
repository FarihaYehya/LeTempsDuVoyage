
//Créer une nouvelle ville //
/*$("#boutonEnvoyer").click(() =>{

  let valeurs = { nom: $("#inputNom").val()};

$.ajax({
  type: "POST",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/recuperationVille",
  data: JSON.stringify(valeurs),
  success: function (resultat) {
    alert("L'API m'a retourné : " + resultat);
     }
  });
 });*/

 //Ajouter des restaurants à une ville //
 $("#boutonEnvoyer").click(() =>{

   let valeurs = { nom: $("#inputNomResto").val(), type: $("#inputType").val(), adresse: $("#inputAdresse").val(), prixLePlusBas: $("#inputPrixBas").val(), prixLePlusHaut: $("#inputPrixHaut").val(), nomVille: $("#inputNomVille").val()};
console.log(valeurs);
 $.ajax({
   type: "POST",
   headers: { "Content-Type": "application/json" },
   url: "http://localhost:8080/API/recuperationMultiRestaurants",
   data: JSON.stringify(valeurs),
   success: function (resultat) {
     alert("L'API m'a retourné : " + resultat);
      }
   });
  });





//Afficher une ville//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllVilles",
  success: function (resultat) {
    alert("L'API m'a retourné : "+resultat);
    $("#Kenya").html(resultat[0].nom.replace(/[""]+/g, ''));
    $("#Copacabana").html(resultat[1].nom.replace(/[""]+/g, ''));
    $("#Dubaï").html(resultat[2].nom.replace(/[""]+/g, ''));
    $("#Istrie").html(resultat[3].nom.replace(/[""]+/g, ''));
  }
  });

  //Afficher un restaurant//

$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllRestaurants",
  success: function (resultat) {
    alert("L'API m'a retourné : "+resultat);
    $("#RestaurantKenya").html(resultat[0].nom.replace(/[""]+/g, ''));
    $("#RestaurantCopacabana").html(resultat[1].nom.replace(/[""]+/g, ''));
  }
  });
