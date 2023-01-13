
//Créer une nouvelle ville //
$("#boutonVille").click(() => {

  let valeurs = { nom: $("#inputNom").val() };

  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationVille",
    data: JSON.stringify(valeurs),
    success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    }
  });
});

//Ajouter des restaurants à une ville //
$("#boutonRestoAVille").click(() => {

  let valeurs = { nom: $("#inputNomResto").val(), type: $("#inputType").val(), adresse: $("#inputAdresse").val(), prixLePlusBas: $("#inputPrixBas").val(), prixLePlusHaut: $("#inputPrixHaut").val(), nomVilles: $("#inputNomVille").val() };
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

//Ajouter des transports à une ville //
$("#boutonTransportAVille").click(() => {

  let valeurs = { typeTransports: $("#inputTypeTransport").val(), nomVille: $("#inputNomVille").val() };
  console.log(valeurs);
  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationMultiTransports",
    data: JSON.stringify(valeurs),
    success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    }
  });
});

//Ajouter des sites touristiques à une ville //
$("#boutonSitesTouristiquesAVilles").click(() => {

  let valeurs = { nom: $("#inputNom").val(), typeTourisme: $("#inputTypeTourisme").val(), prix: $("#inputPrix").val(), nomVilles: $("#inputNomVilles").val() };
  console.log(valeurs);
  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationMultiSitesTouristiques",
    data: JSON.stringify(valeurs),
    success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    }
  });
});

//Ajouter des commentaires à un restaurant //
$("#boutonCommentairesARestaurants").click(() => {

  let valeurs = { nomRestaurants: $("#inputNomRestaurants").val(), commentaires: $("#inputCommentaires").val(), nomPersonnes: $("#inputNomPersonnes").val() };
  console.log(valeurs);
  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationMultiCommentairesRestaurants",
    data: JSON.stringify(valeurs),
    success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    }
  });
});


//Ajouter des commentaires à des Sites Touristiques //
$("#boutonCommentairesASitesTouristiques").click(() => {

  let valeurs = { nomSitesTouristiques: $("#inputNomSitesTouristiques").val(), commentaires: $("#inputCommentaires").val(), nomPersonnes: $("#inputNomPersonnes").val() };
  console.log(valeurs);
  $.ajax({
    type: "POST",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/recuperationMultiCommentairesSitesTouristiques",
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

  let valeurs = { commentaires: $("#inputCommentaires").val(), nomVilles: $("#inputVillesDansCommentaires").val(), nomPersonnes: $("#inputNomPersonnes").val()};
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
    console.log("L'API m'a retourné : " + resultat);
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

//Afficher un commentaire et son nom pour RESTAURANT//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllCommentairesRestaurants",
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    console.log("L'API m'a retourné : "+resultat);
    for(let i = 0; i<resultat.length ;i++) {
    if (resultat[i].nomRestaurants != null){
               divNomRestaurants = document.createElement("div");
               divNomRestaurants.id = "NomRestaurants" + i;
               divNomRestaurants.innerHTML = "Nom d'utilisateur : " + resultat[i].nomPersonnes;

                divObjetRestaurants = document.createElement("div");
                divObjetRestaurants.id = "ObjetRestaurants" + i;
                divObjetRestaurants.innerHTML = "Nom du restaurant : " + resultat[i].nomRestaurants;


               divComRestaurants = document.createElement("div");
               divComRestaurants.id = "CommentaireRestaurants" + i;
               divComRestaurants.innerHTML = "Commentaire : " + resultat[i].commentaires;

               let br = document.createElement("br");

               document.getElementById("CommentairesRestaurants").appendChild(divNomRestaurants);
               document.getElementById("CommentairesRestaurants").appendChild(divObjetRestaurants);
               document.getElementById("CommentairesRestaurants").appendChild(divComRestaurants);
               document.getElementById("CommentairesRestaurants").appendChild(br);

               }
           }
         }
});

//Afficher un commentaire et son nom pour SITES TOURISTIQUES//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllCommentairesSitesTouristiques",
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    console.log("L'API m'a retourné : "+resultat);
    for(let i = 0; i<resultat.length ;i++) {
    if (resultat[i].nomSitesTouristiques != null){
               divNomSitesTouristiques = document.createElement("div");
               divNomSitesTouristiques.id = "NomSitesTouristiques" + i;
               divNomSitesTouristiques.innerHTML = "Nom d'utilisateur : "+ resultat[i].nomPersonnes;

                divObjetSiteTouristiques = document.createElement("div");
                divObjetSiteTouristiques.id = "ObjetSitesTouristiques" + i;
                divObjetSiteTouristiques.innerHTML = "Nom du site touristique : " + resultat[i].nomSitesTouristiques;


               divComSitesTouristiques = document.createElement("div");
               divComSitesTouristiques.id = "CommentaireSitesTouristiques" + i;
               divComSitesTouristiques.innerHTML = "Commentaire : " + resultat[i].commentaires;

               let br = document.createElement("br");

               document.getElementById("CommentairesSitesTouristiques").appendChild(divNomSitesTouristiques);
               document.getElementById("CommentairesSitesTouristiques").appendChild(divObjetSiteTouristiques);
               document.getElementById("CommentairesSitesTouristiques").appendChild(divComSitesTouristiques);
               document.getElementById("CommentairesSitesTouristiques").appendChild(br);

               }
           }
         }
});

//Afficher un commentaire et son nom pour VILLES//
$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllCommentairesVilles",
  success: function (resultat) {
    console.log("L'API m'a retourné : " + resultat);
    console.log("L'API m'a retourné : "+resultat);
    for(let i = 0; i<resultat.length ;i++) {
    if (resultat[i].nomVilles != null){
               divNomVilles = document.createElement("div");
               divNomVilles.id = "NomVilles" + i;
               divNomVilles.innerHTML = "Nom d'utilisateur : " + resultat[i].nomPersonnes;

                divObjetVilles = document.createElement("div");
                divObjetVilles.id = "ObjetVilles" + i;
                divObjetVilles.innerHTML = "Nom de la ville/pays : " + resultat[i].nomVilles;


               divComVilles = document.createElement("div");
               divComVilles.id = "CommentaireVilles" + i;
               divComVilles.innerHTML = "Commentaire : "+resultat[i].commentaires;

               let br = document.createElement("br");

               document.getElementById("CommentairesVilles").appendChild(divNomVilles);
               document.getElementById("CommentairesVilles").appendChild(divObjetVilles);
               document.getElementById("CommentairesVilles").appendChild(divComVilles);
               document.getElementById("CommentairesVilles").appendChild(br);
               }
           }
         }
});





