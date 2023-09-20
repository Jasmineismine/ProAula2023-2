function eliminar(id, urlEliminar, url){
    Swal.fire({
        title: '¿Quieres eliminar el rergistro?',
        icon: 'warning',
        showDenyButton: true,
        confirmButtonText: 'Aceptar',
        denyButtonText: `Cancelar`,
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
            $.ajax({
                url:urlEliminar+id,
                success: function(res){
                    console.log(res);
                }
            });
            Swal.fire('El registro ha sido eliminado!', '', 'success').then((ok)=>{
                if(ok){
                    location.href=url;
                }
            })
            
        } else if (result.isDenied) {
            Swal.fire('No se ha eliminado el registro', '', 'info');
        }
      })
}