document.addEventListener("DOMContentLoaded", () => {
    const cityname = document.getElementById("city-input");
    const getWeatherBtn = document.getElementById("get-weather");
    const getweatherinfo = document.getElementById("weather-info");
    const getcityname = document.getElementById("city-name");
    const gettemp = document.getElementById("temperature");
    const getweatherdesc = document.getElementById("description");
    const geterror = document.getElementById("error-message");
    const APIKEY = "270d0f4baac41becf91bb933d69779cf";

    getWeatherBtn.addEventListener("click", async () => {
        const city = cityname.value.trim();
        if (!city) return;

        try {
            const weatherdata = await fetchweather(city);
            showweatherdata(weatherdata);
        } catch (error) {
            showerror();
        }
    });

    async function fetchweather(city) {
        const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${APIKEY}&units=metric`;
        const response = await fetch(url);
        if (!response.ok) throw new Error("Network response was not ok");
        const data = await response.json();
        return data;
    }

    function showweatherdata(weatherdata) {
        console.log(weatherdata);
        getweatherinfo.classList.remove("hidden");
        geterror.classList.add("hidden");

        getcityname.textContent = weatherdata.name;
        gettemp.textContent = `${weatherdata.main.temp} °C`;
        getweatherdesc.textContent = weatherdata.weather[0].description;
    }

    function showerror() {
        getweatherinfo.classList.add("hidden");
        geterror.classList.remove("hidden");
    }
});
