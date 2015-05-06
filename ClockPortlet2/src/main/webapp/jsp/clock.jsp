<%@ page contentType="text/html" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	
	<link href="/ClockPortlet2/public/jClocksGMT-master/css/jClocksGMT.css" rel="stylesheet">
	<link href="/ClockPortlet2/css/clock.css" rel="stylesheet"/>

	<script src="/ClockPortlet2/public/jquery-1.11.2/jquery-1.11.2.min.js"></script>
	<script src="/ClockPortlet2/public/jClocksGMT-master/js/jClocksGMT.js"></script>
	<script src="/ClockPortlet2/public/jClocksGMT-master/js/jquery.rotate.js"></script>
	
	<script type="text/javascript">
	
		$(function() {
			//init world clocks
			$('.clock_container').each(function() {
				$(this).jClocksGMT({
					offset: $(this).attr('offset')
				});
			});
		});
		
	</script>

	<!-- World Clock -->
    <div id="clock_${fn:replace(city, ' ', '_')}" class="clock_container" offset="${offset}">
        <div class="lbl">${city}</div>
        <div class="clockHolder">
            <div class="rotatingWrapper"><img class="hour" src="/ClockPortlet2/public/jClocksGMT-master/images/clock_hour.png" /></div>
            <div class="rotatingWrapper"><img class="min" src="/ClockPortlet2/public/jClocksGMT-master/images/clock_min.png" /></div>
            <div class="rotatingWrapper"><img class="sec" src="/ClockPortlet2/public/jClocksGMT-master/images/clock_sec.png" /></div>
            <img class="clock" src="/ClockPortlet2/public/jClocksGMT-master/images/clock_face.png" />
        </div>
        <div class="digital">
            <span class="hr"></span><span class="minute"></span> <span class="period"></span>
        </div>
    </div>

