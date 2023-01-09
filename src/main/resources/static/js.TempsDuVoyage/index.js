
//Afficher une ville //

$.ajax({
  type: "GET",
  headers: { "Content-Type": "application/json" },
  url: "http://localhost:8080/API/getAllVilles",
  success: function (resultat) {
    alert("L'API m'a retourné : "+resultat);
    $("#Kenya").html(resultat[0].nom.replace(/[""]+/g, ''));
  }
  });

