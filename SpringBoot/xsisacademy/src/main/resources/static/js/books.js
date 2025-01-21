function detailBooks(id) {
  $.ajax({
    type: "get",
    url: `/books/detail/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Detail Books");
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

function addBooks() {
  $.ajax({
    type: "get",
    url: "/books/add",
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Add Books");
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

function editBooks(id) {
  $.ajax({
    type: "get",
    url: `/books/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Edit Books");
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

function deleteBooks(id) {
  $.ajax({
    type: "get",
    url: `/books/delete/${id}`,
    contentType: "html",
    success: function (response) {
      alert("berhasil dihapus");
      location.reload();
    },
  });
}
