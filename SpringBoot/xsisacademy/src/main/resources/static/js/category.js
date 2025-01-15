function detailForm(id) {
  $.ajax({
    type: "get",
    url: `/category/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Detail Category");
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

function openForm() {
  $.ajax({
    type: "get",
    url: "/category/form",
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Add Category");
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

function editForm(id) {
  $.ajax({
    type: "get",
    url: `/category/edit/${id}`,
    contentType: "html",
    success: function (response) {
      $("#myModal").modal("show");
      $(".modal-title").html("Edit Category");
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

function deleteForm(id) {
  $.ajax({
    type: "get",
    url: `/category/delete/${id}`,
    contentType: "html",
    success: function (response) {
      alert("berhasil dihapus");
      location.reload();
    },
  });
}
