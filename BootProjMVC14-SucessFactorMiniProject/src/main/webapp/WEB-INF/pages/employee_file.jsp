<%@ page language="java" isELIgnored="false"%>
<table data-toggle="table">
      <thead>
        <tr>
          <th>Result Of Uploading</th>
          <th>FIle1</th>
          <th>File2</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${resultMsg}</td>
          <td>${file1}, ${file2}</td>
          <td><a href="./">home</a></td>
        </tr>
      </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/jquery/dist/jquery.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.21.4/dist/bootstrap-table.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.21.4/dist/themes/bootstrap-table/bootstrap-table.min.js"></script>

