const apiclient = (function () {

    function getCityWeatherByName(name, callback) {
        const promise = $.get({
            url: "/weather/city/" + name,
            contentType: "application/json",
        });
        promise.then(
            function (data) {
                callback(null, data);
            },
            function (error) {
                alert("No se pudo realizar la consulta!")
            }
        )
    }

    return {
        getCityWeatherByName: getCityWeatherByName
    }

})();