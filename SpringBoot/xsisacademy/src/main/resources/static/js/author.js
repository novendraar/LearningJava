function detailAuthor(id) {
  $.ajax({
    type: "get",
    url: `/author/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Detail User");
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

function addAuthor() {
  $.ajax({
    type: "get",
    url: "/author/add",
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Add User");
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

function editAuthor(id) {
  $.ajax({
    type: "get",
    url: `/author/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Edit User");
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

function deleteAuthor(id) {
  $.ajax({
    type: "get",
    url: `/author/delete/${id}`,
    contentType: "html",
    success: function (response) {
      alert("berhasil dihapus");
      location.reload();
    },
  });
}
