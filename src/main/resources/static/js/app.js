const app = (function () {

    let map;

    function getCityWeatherByName() {
        let city = $("#city").val();
        if (city === "") {
            alert("Debe Ingresar una ciudad!");
        } else {
            apiclient.getCityWeatherByName(city, (req, res) => {
                appendData(res)
            });
        }
    }

    function appendData(data) {
        $("#part1 tbody").empty();
        $("#part2 tbody").empty();
        $("#part3 tbody").empty();
        $("#part1 > tbody:last").append($("<tr><td>" + data.id + "</td><td>" + data.name + "</td><td>" + data.timezone + "</td><td>" + data.visibility + "</td><td>" + data.coord.lon + "</td><td>" + data.coord.lat + "</td></tr>"));
        $("#part2 > tbody:last").append($("<tr><td>" + data.weather[0].main + "</td><td>" + data.weather[0].description + "</td><td>" + data.main.temp + "</td><td>" + data.main.temp_min + "</td><td>" + data.main.temp_max + "</td><td>" + data.main.feels_like + "</td></tr>"));
        $("#part3 > tbody:last").append($("<tr><td>" + data.pressure + "</td><td>" + data.humidity + "</td><td>" + data.wind.deg + "</td><td>" + data.wind.speed + "</td><td>" + data.sys.sunrise + "</td><td>" + data.sys.sunset + "</td></tr>"));
        moveMapToCoordinates(data.coord.lat, data.coord.lon)
    }

    function initMap() {
        map = new google.maps.Map(document.getElementById("mapa"), {
            zoom: 13,
            center: {lat: 59.325, lng: 18.07},
        })
    }

    function moveMapToCoordinates(lat, lon) {
        let marker = [];
        let bounds = new google.maps.LatLngBounds();
        let position = new google.maps.LatLng(lat, lon);
        marker.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.BOUNCE
            })
        );
        bounds.extend(position);
        map.fitBounds(bounds);
        map.setZoom(13);
    }

    return {
        getCityWeatherByName: getCityWeatherByName,
        moveMapToCoordinates: moveMapToCoordinates,
        initMap: initMap
    }

})();