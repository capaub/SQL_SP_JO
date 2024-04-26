(async function() {
    window.addEventListener('load', function () {
        const ctx = document.getElementById('acquisitions');
        let data = JSON.parse(document.querySelector('#jsonData').outerText);
        new Chart(ctx, {
            type: 'bar',
            data: {
                labels : data.map(row => row.ABR_PAYS),
                datasets: [{
                    label: 'Or',
                    data: data.map(row => row.NB_OR ),
                    backgroundColor: ['#a57c00'],
                    borderColor: ['#a57c00'],
                    borderWidth: 1,
                    barThickness:20
                },{
                    label: 'Argent',
                    data: data.map(row => row.NB_ARG),
                    backgroundColor: ['#c7d1da'],
                    borderColor: ['#c7d1da'],
                    borderWidth: 1,
                    barThickness:20
                },{
                    label: 'Bronze',
                    data: data.map(row => row.NB_BR),
                    backgroundColor: ['#ad7966'],
                    borderColor: ['#ad7966'],
                    borderWidth: 1,
                    barThickness:20
                }]
            },
            options: {
                scales:{
                    x:{
                        beginAtZero:true,
                        ticks:{
                            autoSkip:false
                        },
                        stacked:true
                    },
                    y:{
                        stacked:true
                    }
                }
            }
        });
    });
})();