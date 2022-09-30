function iniciarMap(){
    var coord = {lat:-38.766261 ,lng: -72.7542253};
    var map = new google.maps.Map(document.getElementById('map'),{
      zoom: 10,
      center: coord
    });
    var marker = new google.maps.Marker({
      position: coord,
      map: map
    });
}