// 정기보고서 주요정보조회

// 회사명찾기 버튼 클릭
$('button:contains("회사명찾기")').click();

setTimeout(function () {
  $("#textCrpNm").val("삼성전자");
  $(".btn .btn_search").click();
  setTimeout(function () {
    $("#r_00126380").click();
    $(".btn_area .btn_s_b").click();
    setTimeout(function () {
      $("#selectYear").val("2022");
      $("#reportCode").val("11011");

      $('input:radio[name="gubun"]').each(function (index, item) {
        setTimeout(function () {
          $(item).click();
          $(".if_search_btn_area > .centerWrap > .search_btn").click();
          $("html, body").animate({ scrollTop: 0 }, "slow");
        }, index * 60000);
      });
    }, 500);
  }, 1000);
}, 1000);
