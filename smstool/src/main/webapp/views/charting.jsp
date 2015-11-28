
<%@include file="header.jsp"%>

<script src="<c:url value="/resources/js/highcharts.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/data.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/drilldown.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/exporting.js"/>" type="text/javascript"></script>

<script type="text/javascript">
$(document).on('ready', function () {
    // Create the chart
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Survey Responses'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: 'Average'
            }

        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:.2f}'
                }
            }
        },

        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}</b> of total<br/>'
        },

        series: [{
            name: "Categories",
            colorByPoint: true,
            data: [{
                name: "Learning",
                y: 6.33,
                drilldown: "Learning"
            }, {
                name: "Social",
                y: 4.03,
                drilldown: "Social"
            }, {
                name: "Personal & Emotional",
                y: 5.38,
                drilldown: "Personal & Emotional"
            }]
        }],
        drilldown: {
            series: [{
                name: "Learning",
                id: "Learning",
                data: [
                    [
                        "Motivation",
                        4.13
                    ],
                    [
                        "Independence",
                        6.2
                    ],
                    [
                        "Responsibility",
                        7.11
                    ],
                    [
                        "Participation in learning situations",
                        5.33
                    ],
                    [
                        "Study Skills",
                        1.06
                    ],
                    [
                        "Planning",
                        0.5
                    ]
                ]
            }, {
                name: "Social",
                id: "Social",
                data: [
                    [
                        "Situational awareness",
                        5
                    ],
                    [
                        "Cooperation",
                        4.32
                    ],
                    [
                        "Tolerance",
                        3.68
                    ],
                    [
                        "Relations with teachers and staff",
                        2.96
                    ],
                    [
                        "Relations with students",
                        2.53
                    ],
                    [
                        "Participations in social activities",
                        1.45
                    ]
                ]
            }, {
                name: "Personal & Emotional",
                id: "Personal & Emotional",
                data: [
                    [
                        "Self awareness",
                        2.76
                    ],
                    [
                        "Self confidence",
                        2.32
                    ],
                    [
                        "Resiliance",
                        2.31
                    ],
                    [
                        "Open minded",
                        1.27
                    ],
                    [
                        "Concentration",
                        1.02
                    ]
                ]
            }]
        }
    });
});
</script>

<div class="container">

	<br>
	<div class="row">
		<div class="col-sm-1">
			<h1 class="glyphicon glyphicon-education"></h1>
		</div>
		<div class="col-sm-11">
			<h3><spring:message code='smstool.statistics.combined.title' text='Results - Combined' /></h3>
			<p><spring:message code='smstool.statistics.combined.description'
				text='Please find below the results from all your students combined.' /></p>
		</div>
	</div>

	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

</div>

<%@include file="footer.jsp"%>
