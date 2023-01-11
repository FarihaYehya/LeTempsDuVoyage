
//Créer une nouvelle ville //
/*
$("#boutonEnvoyerVille").click(() =>{

  let valeurs = { nom: $("#inputNom").val()};

$.ajax({
  type: "POST",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/recuperationVille",
  data: JSON.stringify(valeurs),
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
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
     console.log("L'API m'a retourné : " + resultat);
      }
   });
  });


// Ajout Villes dans Continents
$("#boutonajoutVillesAContinents").click(() =>{

  let valeurs = { nomContinents: $("#inputNomContinents").val(), nom: $("#inputNomVillesDansContinents").val()};
console.log(valeurs);
$.ajax({
  type: "POST",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/recuperationMultiVilles",
  data: JSON.stringify(valeurs),
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
     }
  });
 });


// Ajout Villes dans Commentaires
$("#boutonajoutCommentairesAVilles").click(() =>{

  let valeurs = { commentaires: $("#inputCommentaires").val(), nomVilles: $("#inputVillesDansCommentaires").val()};
console.log(valeurs);
$.ajax({
  type: "POST",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/recuperationMultiCommentairesVilles",
  data: JSON.stringify(valeurs),
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
     }
  });
 });




//Afficher une ville//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllVilles",
  success: function (resultat) {
    console.log("L'API m'a retourné : "+resultat);
    $("#Kenya").html(resultat[0].nom.replace(/[""]+/g, ''));
    $("#Copacabana").html(resultat[1].nom.replace(/[""]+/g, ''));
    $("#Dubaï").html(resultat[2].nom.replace(/[""]+/g, ''));
    $("#Istrie").html(resultat[3].nom.replace(/[""]+/g, ''));
  }
  });

  //Afficher un Continent//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllContinents",
  success: function (resultat) {
    console.log("L'API m'a retourné : "+resultat);
    $("#Afrique").html(resultat[0].nom.replace(/[""]+/g, ''));
    $("#Amérique").html(resultat[1].nom.replace(/[""]+/g, ''));
    $("#Asie").html(resultat[2].nom.replace(/[""]+/g, ''));
    $("#Europe").html(resultat[3].nom.replace(/[""]+/g, ''));
  }
  });

  //Afficher un restaurant//

$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllRestaurants",
  success: function (resultat) {
    console.log("L'API m'a retourné : "+resultat);
    $("#RestaurantKenya").html(resultat[0].nom.replace(/[""]+/g, ''));
    $("#RestaurantCopacabana").html(resultat[1].nom.replace(/[""]+/g, ''));
  }
  });
