
//Afficher une ville //

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
// Aficher un Continent
  $.ajax({
    type: "GET",
    headers: { "Content-Type": "application/json" },
    url: "http://localhost:8080/API/getAllContinents",
    success: function (resultat) {
      alert("L'API m'a retourné : "+resultat);
      $("#Afrique").html(resultat[0].nom.replace(/[""]+/g, ''));
    }
    });

      $.ajax({
        type: "GET",
        headers: { "Content-Type": "application/json" },
        url: "http://localhost:8080/API/getAllContinents",
        success: function (resultat) {
          alert("L'API m'a retourné : "+resultat);
          $("#Amérique").html(resultat[1].nom.replace(/[""]+/g, ''));
        }
        });
         $.ajax({
            type: "GET",
            headers: { "Content-Type": "application/json" },
            url: "http://localhost:8080/API/getAllContinents",
            success: function (resultat) {
              alert("L'API m'a retourné : "+resultat);
              $("#Asie").html(resultat[2].nom.replace(/[""]+/g, ''));
            }
            });

              $.ajax({
                type: "GET",
                headers: { "Content-Type": "application/json" },
                url: "http://localhost:8080/API/getAllContinents",
                success: function (resultat) {
                  alert("L'API m'a retourné : "+resultat);
                  $("#Europe").html(resultat[3].nom.replace(/[""]+/g, ''));
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

