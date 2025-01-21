function detailPublisher(id) {
  $.ajax({
    type: "get",
    url: `/publisher/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Detail Publisher");
      $(".modal-body").html(response);
      $(".modal-body input, .modal-body select, .modal-body textarea").prop(
        "disabled",
        true
      );
      $(".modal-body button[type='submit']")
        .html("OK")
        .removeClass("btn-primary")
        .addClass("btn-success")
        .prop("disabled", true);
    },
  });
}

function openPublisher() {
  $.ajax({
    type: "get",
    url: "/publisher/add",
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Add Publisher");
      $(".modal-body").html(response);
      $(".modal-body input, .modal-body select, .modal-body textarea").prop(
        "disabled",
        false
      );
      $(".modal-body button[type='submit']")
        .html("Add")
        .removeClass("btn-success")
        .addClass("btn-primary");
    },
  });
}

function editPublisher(id) {
  $.ajax({
    type: "get",
    url: `/publisher/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Edit Publisher");
      $(".modal-body").html(response);
      $(".modal-body input, .modal-body select, .modal-body textarea").prop(
        "disabled",
        false
      );
      $(".modal-body button[type='submit']")
        .html("Save")
        .removeClass("btn-success")
        .addClass("btn-primary");
    },
  });
}

function deletePublisher(id) {
  $.ajax({
    type: "get",
    url: `/publisher/delete/${id}`,
    contentType: "html",
    success: function (response) {
      alert("berhasil dihapus");
      location.reload();
    },
  });
}
